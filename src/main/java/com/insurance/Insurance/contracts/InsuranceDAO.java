package com.insurance.Insurance.contracts;

import java.util.List;

import com.insurance.Insurance.model.CustomerData;
import com.insurance.Insurance.model.InsurancePolicy;
import com.insurance.Insurance.model.InsurancePolicySchedule;

public interface InsuranceDAO {
	List<InsurancePolicySchedule> getAllSchedule();

	List<InsurancePolicySchedule> getAllScheduleById(int id);

	int getNonPaymentStatus(int id);

	List<Integer> findDistinctIplcIds();

	List<InsurancePolicy> getAllPolicies();

	int addPolicy(InsurancePolicy e);

	int updateStatus(InsurancePolicy e);

	InsurancePolicy getPolicyById(int id);

	int addCustomer(CustomerData e);

}
