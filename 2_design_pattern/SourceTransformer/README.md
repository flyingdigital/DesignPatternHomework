## 设计模式第二次作业第三个示例

### 原来的类

MainClass类(测试)

```
class MainClass{
	public static void main(String args[]);
}
```

DataBaseSource

```
class DataBaseSource{
	
}
```

TextSource

```
class TextSource{

}
```

XMLTransformer

```
class XMLTransformer{

}
```

XLSTransformer

```
class XLSTransformer{

}
```



### 重写类原型

MainClass类(测试)

```
class MainClass{
	public static void main(String args[]);
}
```

DataBaseSource

```
class DataBaseSource extends AbstractSource{
	
}
```

TextSource

```
class TextSource extends AbstractSource{

}
```

XMLTransformer

```
class XMLTransformerextends AbstractrTransformer{

}
```

XLSTransformer

```
class XLSTransformer extends AbstractrTransformer{

}
```

AbstractSource

```
class abstract AbstractSource{

}
```

AbstractrTransformer

```
class AbstractTransformer{}
```



### 运行结果

![](img/运行结果.png)