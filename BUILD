load("@bazel_tools//tools/jdk:default_java_toolchain.bzl", "default_java_toolchain")

#
# Description: Blaze plugin for various IntelliJ products.
#
load(
    "//:build-visibility.bzl",
    "BAZEL_PLUGIN_SUBPACKAGES",
    "DEFAULT_TEST_VISIBILITY",
    "create_plugin_packages_group",
)

licenses(["notice"])

create_plugin_packages_group()

default_java_toolchain(
    name = "custom_java_17_toolchain",
    configuration = dict(),
    java_runtime = "@rules_java//toolchains:remotejdk_17",
    package_configuration = [
        ":java_8",
    ],
    source_version = "17",
    target_version = "17",
)

# this associates a set of javac flags with a set of packages
java_package_configuration(
    name = "java_8",
    javacopts = ["-source 8 -target 8"],
    packages = ["java_8_packages"],
)

# this is a regular package_group, which is used to specify a set of packages to apply flags to
package_group(
    name = "java_8_packages",
    packages = [
        "//proto/...",
        "//third_party/bazel/src/main/protobuf/...",
    ],
)
