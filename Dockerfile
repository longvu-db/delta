#
# Copyright (2021) The Delta Lake Project Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
FROM ubuntu:jammy-20231004

ENV DEBIAN_FRONTEND noninteractive
ENV DEBCONF_NONINTERACTIVE_SEEN true

RUN apt-get update
RUN apt-get install -y software-properties-common
RUN add-apt-repository -y ppa:deadsnakes/ppa
RUN apt-get update
RUN apt-get install -y curl
RUN apt-get install -y wget
RUN apt-get install -y openjdk-17-jdk
RUN apt-get install -y python3.10 python3.10-distutils python3.10-venv
RUN curl -sS https://bootstrap.pypa.io/get-pip.py | python3.10
RUN update-alternatives --install /usr/bin/python3 python3 /usr/bin/python3.10 1
RUN update-alternatives --install /usr/bin/pip3 pip3 /usr/local/bin/pip3 1
RUN apt-get install -y git

# Upgrade pip. This is needed to use prebuilt wheels for packages cffi (dep of cryptography) and
# cryptography. Otherwise, building wheels for these packages fails.
RUN pip3 install --upgrade pip

# Update the pip version to 24.0. By default `pyenv.run` installs the latest pip version
# available. From version 24.1, `pip` doesn't allow installing python packages
# with version string containing `-`. In Delta-Spark case, the pypi package generated has
# `-SNAPSHOT` in version (e.g. `3.3.0-SNAPSHOT`) as the version is picked up from
# the`version.sbt` file.
RUN pip install pip==24.0 setuptools==69.5.1 wheel==0.43.0

RUN pip3 install pyspark==4.0.1

RUN pip3 install mypy==1.0.1

RUN pip3 install pydocstyle==3.0.0

RUN pip3 install pandas==2.0.3

RUN pip3 install pyarrow==14.0.1

RUN pip3 install numpy==1.24.3

RUN pip3 install importlib_metadata==3.10.0

RUN pip3 install cryptography==37.0.4

# We must install cryptography before twine. Else, twine will pull a newer version of
# cryptography that requires a newer version of Rust and may break tests.
RUN pip3 install twine==4.0.1

# Use setuptools version that supports Python 3.10 and allows -SNAPSHOT versions
# Combined with pip==24.0, this should allow -SNAPSHOT versions
RUN pip3 install wheel==0.36.2

RUN pip3 install setuptools==50.3.2

# PySpark Spark Connect dependencies (checked by pyspark/sql/connect/utils.py).
# Pin grpcio<1.63.0: PySpark 4.0 checks grpc.__version__ which was removed in 1.63.0.
RUN pip3 install "grpcio>=1.48.2,<1.63.0" "grpcio-status>=1.48.1" \
    "googleapis-common-protos>=1.56.4" "zstandard>=0.23.0"

# Do not add any non-deterministic changes (e.g., copy from files 
# from repo) in this Dockerfile, so that the  docker image 
# generated from this can be reused across builds.
