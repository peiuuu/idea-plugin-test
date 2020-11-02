package com.github.peiuuu.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.peiuuu.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
