package com.yq.springframework.context;

import com.yq.springframework.beans.BeansException;

/**
 * 可配置化的 ApplicationContext，首次声明了极具重量级的行为 —— refresh方法
 *
 * 所谓的可配置化，配置的大概是如下内容：
 * - parent (父子容器)
 * - environment
 * - add Application Listener
 * - add resource protocol resolver
 *
 * 声明了 refresh 行为
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新 spring 上下文
     * 注意，该方法是 spring 启动过程中最核心的方法，没有之一！
     *
     * 实际上 refresh 方法的作用，就是在 是 spring 上下文
     * @throws BeansException ex
     */
    void refresh() throws BeansException;
}
