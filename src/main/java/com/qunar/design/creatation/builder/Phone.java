package com.qunar.design.creatation.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
@Data
@Builder
public class Phone {
    protected String screen;
    protected String cpu;
    protected String memory;

    //public String getScreen() {
    //    return screen;
    //}
    //
    //public String getCpu() {
    //    return cpu;
    //}
    //
    //public String getMemory() {
    //    return memory;
    //}
    //
    //@Override
    //public String toString() {
    //    return "Phone{" +
    //            "screen='" + screen + '\'' +
    //            ", cpu='" + cpu + '\'' +
    //            ", memory='" + memory + '\'' +
    //            '}';
    //}
}
