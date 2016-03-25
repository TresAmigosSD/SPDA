
# SPDA
SMV Public Data App

# Setup User Conf
The minimal setup is to create
```
conf/smv-user-conf.props
```
with
```
smv.dataDir = file:///path/to/your/data
```

For more details please refer [SMV Application Configuration](https://github.com/TresAmigosSD/SMV/blob/master/docs/user/app_config.md)

All data files for this project can be downloaded from the internet. Please refer [Data Source](docs/data/0_data_toc.md).

# Build and Run
Full details on how to build/run/use this application can be found in the [Getting Started section of the SMV User Guide](https://github.com/TresAmigosSD/SMV/blob/master/docs/user/getting_started.md)

## Build App
```shell
$ mvn clean install
```

## Run App in batch
```shell
$ _SMV_HOME_/tools/smv-run --run-app
```

## Run App in Spark Shell
```shell
$ _SMV_HOME_/tools/smv-shell
```
