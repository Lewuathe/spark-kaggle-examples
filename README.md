# kaggle-jobs

## Compile

```
$ sbt clean package
```

## San Francisco Crime Classification
 
This task is done by `SfCrimeClassification`.

```
$ ./bin/spark-submit --packages com.databricks:spark-csv_2.11:1.2.0 \
                     --class "com.lewuathe.SfCrimeClassification" \
                     --master local[3] \ 
                     <Jar File of this project> \
                     <Traingin File Path> <Test File Path>
```


