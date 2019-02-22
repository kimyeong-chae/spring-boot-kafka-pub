## In OS X

#### 1.Install Kafka

<code>
$ brew install kafka
</code>

#### 2. Start Zookeeper
<code>
$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
</code>

#### 3. Start Kafka
<code>
$ kafka-server-start /usr/local/etc/kafka/server.properties
</code>

#### 4. Create Topic 
<code>
$ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
</code>
