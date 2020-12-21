package strategy_JMservices;

import pages_repository.BasePage;

public interface IFlowUser <T extends BasePage>{
    void setUserFlow(T page);
}
