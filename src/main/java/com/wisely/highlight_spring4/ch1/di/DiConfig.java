package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 1��@Configuration������ǰ����һ�������࣬�ں���1.3.2�ڵ�Java�������и���ϸ��˵����
 * 2��ʹ��@ComponentScan���Զ�ɨ�����������ʹ��@Service��@Component��@Repository��@Controller���࣬��ע��ΪBean
 * @author Mask
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
public class DiConfig {

}
