import org.gradle.api.Plugin
import org.gradle.api.Project


public class ClickPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println("配置成功--------->ClickPlugin")
    }
}