package com.haoyudu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.haoyudu.account","com.haoyudu.service","com.haoyudu.mapper"})
public class JavaConfig {
}
