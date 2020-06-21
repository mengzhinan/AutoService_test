package com.duke.autoservice_test

import java.util.*

/**
 * @Author: duke
 * @DateTime: 2020-06-20 20:36
 * @Description:
 */
object ServiceLoaderHelper {

    private fun <T> getServiceLoader(interfaceClass: Class<T>?): ServiceLoader<T>? {
        return ServiceLoader.load(interfaceClass)
    }

    fun <T> loadServices(interfaceClass: Class<T>?): List<T>? {
        val loader = getServiceLoader(interfaceClass) ?: return null
        val iterator: Iterator<T> = loader.iterator()
        val list: MutableList<T> = mutableListOf()
        while (iterator.hasNext()) {
            val t: T? = iterator.next()
            if (t != null) {
                list.add(t)
            }
        }
        return list
    }

    fun <T> loadService(interfaceClass: Class<T>?): T? {
        val loader = getServiceLoader(interfaceClass) ?: return null
        val iterator: Iterator<T> = loader.iterator()
        return if (iterator.hasNext()) {
            iterator.next()
        } else null
    }

}
