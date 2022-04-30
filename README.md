**Базовые исключения и модель ответа с ответом**

Для подключения к проекту необходимо сделать две вещи.
1. Добавить репозиторий в проект. Пример для maven:
````
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
````
Для gradle:
````
allprojects {
	repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}
````
2. Добавить зависомость. Пример для Maven:
````
<dependency>
	 <groupId>com.github.Lazovski1991</groupId>
	 <artifactId>bath-exeption</artifactId>
	 <version>0.0.2</version>
</dependency>
````

Для gradle:
````
dependencies {
   implementation 'com.github.Lazovski1991:bath-exeption:0.0.2'
}
````

В данной библиотеке следующий набор исключений:

AuthException - для исключений связанных с авторизацией

ActionDBException - для ислючений связанных с записью или поиском записей в БД

LogicException - для исключений связанных с какими-то запрещенными действиями

ExternalApiException - для исключений связанных с внешними запросами

CoreException - исключение по умолчанию