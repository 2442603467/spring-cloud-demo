//package com.ydj.sso.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.JedisCluster;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * @Author by ydj
// * @Date 2019/7/13:16 PM
// **/
////@Configuration
////@EnableCaching
//public class JedisConfig {
//
//    @Value("${spring.redis.cluster.nodes}")
//    private String clusterNodes;
//
////    @Bean
//    public JedisCluster getJedisCluster(){
//        //分割node节点
//        String[] nodes = clusterNodes.split(",");
//        Set<HostAndPort> nodeSet = new HashSet<>();
//        for(String node : nodes){
//            String[] hostAndPort = node.split(":");
//            nodeSet.add(new HostAndPort(hostAndPort[0],Integer.parseInt(hostAndPort[1])));
//        }
//
//        JedisCluster jedisCluster = new JedisCluster(nodeSet);
//        jedisCluster.auth("123456");
//        return jedisCluster;
//    }
//}
