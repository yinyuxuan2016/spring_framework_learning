1.DTD和XSD的区别
两者都是xml规范的定义规范，XSD的publicID为null，而DTD则不会
2.EntityResolver的作用:提供一个如何寻找DTD声明的方法
3.spring的xml默认标签有四种：beans、bean、alias、import四种标签
4.lookup-method和replaced-method的区别
5.lookup-method这是通过获取器注入的方式
eg:teacher和student是user类的子类，并且都实现了user的showMe方法，getBeanTest类有获取user的抽象方法
并且该类调用了user的showMe方法，在创建这个bean的时候，指定具体的bean（student或者teacher），通过lookup-method进行bean注入。
6.qualifier的使用
使用自动注解进行注入bean时，spring容器中匹配的候选bean必须是有且只有一个，若有相同beanName的bean，可以使用Qualifier注入bean的名称。