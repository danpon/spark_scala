val df = spark.read.parquet("data/washing.parquet")

//columns list
df.columns

//nb of columns
df.columns.size
