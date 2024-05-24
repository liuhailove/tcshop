package com.shop.tcshop.models.fe;

import java.util.List;

/**
 * 直播信息
 */
public class ModuleInfoWrapper {
    private ModuleInfo moduleInfo ;

    /**
     * 直播列表
     */
    private List<Live> list;

    public ModuleInfoWrapper(ModuleInfo moduleInfo, List<Live> list) {
        this.moduleInfo = moduleInfo;
        this.list = list;
    }

    public ModuleInfo getModuleInfo() {
        return moduleInfo;
    }

    public void setModuleInfo(ModuleInfo moduleInfo) {
        this.moduleInfo = moduleInfo;
    }

    public List<Live> getList() {
        return list;
    }

    public void setList(List<Live> list) {
        this.list = list;
    }
}
