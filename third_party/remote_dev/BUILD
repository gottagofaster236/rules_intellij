load("//intellij_platform_sdk:build_defs.bzl", "select_for_plugin_api")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "remote_dev_internal",
    visibility = ["//visibility:private"],
    exports = select_for_plugin_api({
        "intellij-2024.2": ["@remote_dev_2024_2//jar"],
        "intellij-ue-2024.2": ["@remote_dev_2024_2//jar"],
        "default": [],
    }),
)

java_library(
    name = "remote_dev",
    neverlink = 1,
    exports = [":remote_dev_internal"],
)

java_library(
    name = "remote_dev_for_tests",
    testonly = 1,
    exports = [":remote_dev_internal"],
)
