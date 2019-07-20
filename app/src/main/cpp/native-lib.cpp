#include <jni.h>
#include <stdlib.h>
#include <iostream>
#include "SoStringUtil.h"

using namespace std;

//string getStringFromSoLibrary();

extern "C"
JNIEXPORT jstring
JNICALL
Java_com_example_nativesotest_MainActivity_nGetStringFromSo(JNIEnv *env, jobject instance)
{
    string result = getStringFromSoLibrary();
    return env->NewStringUTF(result.c_str());
}