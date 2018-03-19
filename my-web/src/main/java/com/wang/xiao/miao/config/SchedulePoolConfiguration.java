package com.wang.xiao.miao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * Description: 定时任务线程池配置
 *
 * {@link ScheduledAnnotationBeanPostProcessor}
 *
 * <p>Autodetects any {@link SchedulingConfigurer} instances in the container,
 * allowing for customization of the scheduler to be used or for fine-grained
 * control over task registration (e.g. registration of {@link Trigger} tasks.
 * See the @{@link EnableScheduling} javadocs for complete usage details.*
 *
 * @author tilkai
 * @date 2017-10-09 下午2:42
 */
@Configuration
public class SchedulePoolConfiguration implements SchedulingConfigurer {

    private static final Integer threadPoolNum = 10;

    /**
     * newSingleThreadScheduledExecutor() 重写为 newScheduledThreadPool(num);
     * @param taskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(threadPoolNum));
    }
}
