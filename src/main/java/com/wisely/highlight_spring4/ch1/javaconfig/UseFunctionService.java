package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.FunctionService;

/**
 * 1���˴�û��ʹ��@Service����Bean
 * 2���˴�û��ʹ��@Autowiredע��ע��Bean
 * @author Mask
 *
 */
public class UseFunctionService {

	FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}