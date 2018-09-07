package com.example.acitivitidemo.service.impl;

import com.example.acitivitidemo.service.ActivitiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ActivitiServiceImpl implements ActivitiService {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    public void activiti() {
        this.logger.info("任务已经执行.........");

    }

    public List<String> user() {
        return Arrays.asList("xiaoming", "xiaohong");
    }


}
