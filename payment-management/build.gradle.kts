plugins {
	id("org.springframework.boot")

	kotlin("jvm")
	kotlin("plugin.spring")
}

dependencies {
	//Note the line implementation(project(":test-utils")). This is very powerful as it allows for you to pull in this module as a dependency.
	//Just be aware of circular dependencies, i.e. modules that depend on each other.
	// for Ex : You cannot also have implementation(project(":payment-management")) in the test-utils module
	// as this would create a circular dependency.
	//
	//
	//implementation(project(":test-utils"))

	implementation(kotlin("reflect"))
	implementation(kotlin("stdlib-jdk8"))
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}