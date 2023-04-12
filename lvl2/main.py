from dataclasses import dataclass

@dataclass(order=True)
class Employee:
    name: str
    age: int
    minimumSalary: float = 5000

    def somefunc(self):
      pass

def main():
    print(Employee('Jean',20))
    



if __name__ == '__main__':
    main()
