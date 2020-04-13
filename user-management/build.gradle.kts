plugins {
	id("org.springframework.boot")

	kotlin("jvm")
	kotlin("plugin.spring")
	//id("org.jetbrains.kotlin.plugin.noarg")
	id ("org.jetbrains.kotlin.plugin.jpa")

}


/*jar {
	baseName = 'SpringBootMultiModulesGradleNpm'
	version = '0.0.1-SNAPSHOT'
	manifest {
		attributes("Main-Class": "com.roytuts.main.Application")
	}
	from('../web-app/build') {
		into 'public'
	}
}
jar.dependsOn(':web-app:build')*/


dependencies {
	//Note the line implementation(project(":test-utils")). This is very powerful as it allows for you to pull in this module as a dependency.
	//Just be aware of circular dependencies, i.e. modules that depend on each other.
	// for Ex : You cannot also have implementation(project(":user-management")) in the test-utils module
	// as this would create a circular dependency.
	//
	//
	//implementation(project(":test-utils"))

	implementation(kotlin("reflect"))
	implementation(kotlin("stdlib-jdk8"))
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-data-rest")
//	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
//	implementation("org.mongodb:mongodb-driver")

	implementation("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
