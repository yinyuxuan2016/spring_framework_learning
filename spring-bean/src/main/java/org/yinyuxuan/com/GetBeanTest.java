package org.yinyuxuan.com;

/**
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public abstract class GetBeanTest {
    public void showMe(){
        this.getBean().showMe();
    }
    public abstract User getBean();
}
