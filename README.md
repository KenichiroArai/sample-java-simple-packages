# sample-java-simple-packages

シンプルな Java で GitHub Packages を試すサンプルプロジェクトです。

## 概要

このプロジェクトは、GitHub Packages に Maven パッケージを公開する方法を示すサンプルです。

## 前提条件

- Java 21
- Maven
- GitHub アカウント

## セットアップと使用方法

### パッケージの公開

1. このリポジトリをクローンまたはフォークします。
2. GitHub リポジトリで新しいリリースを作成します：
   - "Releases" > "Create a new release"
   - 新しいタグを作成（例：`v0.1.0`）
   - リリースタイトルと説明を入力
   - "Publish release"をクリック
3. GitHub Actions が自動的に実行され、パッケージが GitHub Packages に公開されます。

### パッケージの使用

他のプロジェクトでこのパッケージを使用するには：

1. `~/.m2/settings.xml`に以下を追加して GitHub Packages の認証を設定：

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

2. 使用したいプロジェクトの`pom.xml`に以下を追加：

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/OWNER/REPOSITORY</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>sample-simple-java-packages</artifactId>
        <version>0.1.0</version>
    </dependency>
</dependencies>
```

## 注意事項

- GitHub Personal Access Token (PAT) には`read:packages`権限が必要です
- パッケージを公開する場合は`write:packages`権限も必要です
- リポジトリ名とパスは適宜置き換えてください

## ライセンス

このプロジェクトは MIT ライセンスの下で公開されています。
