package plugin


import extention.getPluginId
import extention.getVersionCatalog
import extention.implementation
import extention.kapt
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.plugins.PluginManager
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.plugin.KaptExtension



internal class HiltPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        applyPlugin(target.pluginManager, target.getVersionCatalog())
        applyDependency(target.dependencies, target.getVersionCatalog())
        applyKapt(target.extensions.getByType())
    }

    private fun applyPlugin(manager: PluginManager, libs : VersionCatalog) = with(manager) {
        apply(libs.getPluginId("hiltAndroid"))
        apply("kotlin-kapt")
    }


    private fun applyDependency(handler: DependencyHandler, libs: VersionCatalog) = with(handler) {
        implementation(libs.findLibrary("hilt-android").get())
        kapt(libs.findLibrary("hilt-android-compiler").get())
    }
    private fun applyKapt(extension: KaptExtension) = with(extension) {
        correctErrorTypes = true
    }
}
