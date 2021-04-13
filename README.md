


### 启动`Feature`模块的调试

https://developer.harmonyos.com/cn/docs/documentation/doc-guides/ide_debug_emulator-0000001115721921

> 在启动Feature模块的调试前，请检查Feature模块下的config.json文件的abilities数组是否存在“visible”属性，如果不存在，请手动添加，否则Feature模块的调试无法进入断点。Entry模块的调试不需要做该检查。

> 如果Feature模块手动添加了“visible”属性为true，表示该模块可以被其它的应用所调用。
如果您不允许该模块被其它应用调用，请在调试完成后手动删除visible属性。