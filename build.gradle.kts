plugins {
	java
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.gschoudhary"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
//	implementation("org.springframework.boot:spring-boot-starter-batch")
//	implementation("org.springframework.boot:spring-boot-starter-graphql")
	implementation("org.springframework.boot:spring-boot-starter-web")
//	implementation("org.springframework.boot:spring-boot-starter-webflux")
	compileOnly("org.projectlombok:lombok")
//	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
//	testImplementation("io.projectreactor:reactor-test")
//	testImplementation("org.springframework.batch:spring-batch-test")
//	testImplementation("org.springframework.graphql:spring-graphql-test")
//	runtimeOnly("com.h2database:h2")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation ("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("mysql:mysql-connector-java")
	implementation("commons-codec:commons-codec:1.5")
	implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.1")
	implementation("com.google.code.gson:gson:2.10.1")



}

tasks.withType<Test> {
	useJUnitPlatform()
}

jar {
	manifest {
		attributes(
			'Class-Path': configurations.compile.files.collect {"$it.name"}.join(' '),
		'Main-Class': 'products.ProductAPI')}
	from {
		configurations.compile.collect { it.isDirectory() ? it : zipTree(it) }
	}
}
