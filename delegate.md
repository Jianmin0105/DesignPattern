
```java

Interface IExecutor {
  void executor(String task);
}

class EmployeeA implements IExecutor {
  @Override
  void executor(String task) {
  }
}

class EmployeeB implements IExecutor {
  @Override
  void execute(String task);
}

class Leader implements IExecutor {
  private Map<String, IExecutor> map = new HashMap<>();
  
  pubilc Leader() {
    map.put("clean", new EmployeeA());
    map.put("sleep", new EmployeeB());
  }
  
  @Override
  void execute(String task) {
    map.get(task).execute();
  }
}

class Boss {
  pbulic static void main(String[] args) {
    Leader leader = new Leader();
    leader.execute("clean");
  
  }

}

```
