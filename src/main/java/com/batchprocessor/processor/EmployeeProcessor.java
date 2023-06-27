package com.batchprocessor.processor;

import org.springframework.batch.item.ItemProcessor;

import com.batchprocessor.model.Employee;
import com.batchprocessor.model.EmployeeDTO;

public class EmployeeProcessor implements ItemProcessor<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO process(final Employee employee) throws Exception {
        System.out.println("Transforming Employee(s) to EmployeeDTO(s)..");
        final EmployeeDTO empployeeDto = new EmployeeDTO(employee.getFirstName(), employee.getLastName(),
                employee.getCompanyName(), employee.getAddress(),employee.getCity(),employee.getCounty(),employee.getState()
        ,employee.getZip());

        return empployeeDto;
    }

}
