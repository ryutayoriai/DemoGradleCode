# 環境面

- JDK8(OpenJDK8/AWS coretto8)
- Kotlin
- Ktlint(これは必須ではない)

```
https://huideyeren.info/2019/03/23/spring-boot-setup/
```

- JDKにAdoptOpenJDKを利用すると、SSL証明書の問題でビルドできない→AmazonCoretto8に変更

### VisualStudioCodeの場合、以下の拡張パックをインストールすること

- Java Extension Pack
- Kotlin
- Kotlin Debugger
- Spring Boot Extension Pack


# データベース環境を整備する

- postgresql

**※以下はDockerでpostgresを起動する場合**

## データ永続化のためにvolumeを作成する

```
docker create --name interndb postgres
```

## 起動

```
docker-compose up -d
```

## ログを確認する
```
docker-compose logs -f
```

### データベース初期化は含まれてないため、起動後は各自でデータベースを作成してください。
### 接続情報はapplication.propertiesに記載しています。


# SpringBootの起動(VSCode利用時)

1. メニューから、タスクの起動→buildを実行後、タスクの起動→runを実行（次回以降はF1でタスクの起動が選択できる)

2. 正常に起動していることを確認→「Started Apllication ...」が最終行で出力されていればOK

3. ブラウザよりlocalhost:8080/demo?name=XX or localhost://8080/demo/findAllで正しく表示されていれば問題なし。

