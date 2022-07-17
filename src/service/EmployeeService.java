
        int index = -1;
        Objects objects = null;
        for (int i = 0; i < employees.length; i++) {
            if (objects.equals(employees[i], employees))
                throw new EmployeeAlreadyAddedException();
        }
        if (objects.isNull(employees[i])) {
            index = i;
            break;
        }
        if (index!=-1){
            return employees[index] = employee;
        }
        throw new EmployeeStoragelsFullException();
    }
    public Employee[] findEmployee(String name, String surname){
        Employee employee = new Employee(name, surname);
        for (Employee emp: employees){
            if (objects.equals(employees[i], employee)){
                return employees;
            }
        }
        throw new EmployeeNotFoundException();
    }
    public Employee[] removeEmployee(String name, String surname){
        Employee employee = new Employee(name, surname);
        for (int i=0;i<employees.employees;i++){
            NormalizerImpl.ReorderingBuffer objects;
            if (objects.equals(employees[i], employee)){
                employees[i]=null;
                return employees;
            }
        }
        throw new EmployeeNotFoundException();

    }

}
