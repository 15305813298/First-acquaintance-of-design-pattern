# First-acquaintance-of-design-pattern
First acquaintance of design pattern
1. * UML
![Image text](./src/Resource/image/UML.jpg)
其中关系如路径`src/Java/UML`中类定义。
车用接口声明，提供外部使用。小汽车和自行车都是车的一种。
`组合`：组合是一种很强的关系xx has a xx 如小汽车 has a 引擎，类具有相同的生命周期无法单独存在。
`聚合`：聚合关系并不是那么强，但又有关联，如学生组成班级，但即使学生不存在，班级也能存在。生命周期不受双方约束。
`依赖`：依赖，如图学生依赖自行车出行，意味着学生可能使用到自行车的一部分属性，但不完全只能使用自行车。
`关联`：只有在特定情况下才会使用到关联对象的属性。
`泛化`: 泛化是xx is a xx的关系，例如SUV is a 小汽车。
