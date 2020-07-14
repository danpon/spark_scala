val df = spark.read.parquet("data/washing.parquet")
df.createOrReplaceTempView("washing")
df.show()

spark.sql("select count(*) as cnt from washing").first().get(0)
