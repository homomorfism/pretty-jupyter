package com.github.homomorfism.prettyjupyter.services

import com.intellij.openapi.project.Project
import com.github.homomorfism.prettyjupyter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
