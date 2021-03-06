package com.dbg.cloud.acheron.autoconfigure.store;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;
import java.util.List;

@ConfigurationProperties(prefix = "cassandra")
@Getter
@Setter
public class CassandraProperties {

    private List<InetAddress> contactPoints;
    private Integer port;
    private Integer initialConnectionRetryCount;
    private Integer waitTimeBeforeRetriesInSec;
}
