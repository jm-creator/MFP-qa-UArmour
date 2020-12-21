package services_JM_houseOfservices;

import pages_repository.BasePage;

public interface IFlowUser <T extends BasePage>{
    void setUserFlow(T page);
}
