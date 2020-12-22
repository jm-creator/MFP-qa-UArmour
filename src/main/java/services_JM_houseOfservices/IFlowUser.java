package services_JM_houseOfservices;

import pages_repository.BasePageJM;

public interface IFlowUser <T extends BasePageJM>{
    void setUserFlow(T page);
}
