# Apache Thriftインストール  
## Mac  
Thriftをインストール  
` > brew install thrift` 

確認

    > thrift -version
    Thrift version 0.9.3

## Windows  
まだ試してない（メモ）  
[http://www.apache.org/dyn/closer.cgi?path=/thrift/0.9.3/thrift-0.9.3.exe]

# スキーマファイルからジェネレート  
Javaコード生成  
`> thrift --gen java swa-schema.thrift`  
Rubyコード生成  
`> thrift --gen rb swa-schema.thrift`  
C#コード生成  
`> thrift --gen csharp swa-schema.thrift`  
PHPコード生成  
`> thrift --gen php swa-schema.thrift`
