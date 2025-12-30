plugins {
	application
}

dependencies {
	implementation(project(":core"))
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation(platform("com.fasterxml.jackson:jackson-bom:2.20.1"))
}

application {
	mainClass.set("com.example.jackson2.Jackson2MainKt")
}
