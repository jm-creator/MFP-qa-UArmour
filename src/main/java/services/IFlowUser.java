package services;

import pages.BasePageJM;

public interface IFlowUser <T extends BasePageJM>{
    void setUserFlow(T page);
}
