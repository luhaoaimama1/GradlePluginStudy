import org.gradle.api.Plugin
import org.gradle.api.Project

class Test5: Plugin<Project> {

    override fun apply(project: Project) {
        print("加载成功")
//        val androidComponents = project.extensions.getByType(AndroidComponentsExtension::class.java)
//        androidComponents.finalizeDsl { extension ->
//            extension.buildTypes.create("extra").let {
//                it.isJniDebuggable = true
//            }
//        }
    }
}