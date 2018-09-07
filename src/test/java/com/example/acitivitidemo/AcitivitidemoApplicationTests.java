package com.example.acitivitidemo;

import com.example.acitivitidemo.service.ActivitiService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcitivitidemoApplicationTests {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ActivitiService activitiService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;


    @Test
    public void contextLoads() {

        this.logger.info("--------------------------------------------------");
        ProcessInstance instance =
                this.runtimeService.startProcessInstanceByKey("myProcess_1", "1");

        System.out.println("流程启动成功, 流程：" + instance);

        this.logger.info("--------------------------------------------------");
    }


    @Test
    public void findTasksByUserId() {

        String userId = "duLingJiang";
        List<Task> resultTask = this.taskService.createTaskQuery()
                .processDefinitionKey("test").processDefinitionKey(userId).list();
        this.logger.info("任务列表：" + resultTask);
    }




}
