package com.example.checks

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue
import com.example.checks.GetClassSimpleNameDetector

class LintRegistry: IssueRegistry() {

    override val issues: List<Issue>
        get() = listOf(GetClassSimpleNameDetector.ISSUE)

    override val api: Int
        get() = CURRENT_API
}