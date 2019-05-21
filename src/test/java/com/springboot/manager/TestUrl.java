package com.springboot.manager;


import com.springboot.manager.model.dto.PermissionDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 10:10 2018/6/14
 */
@Component
public class TestUrl {
    private String shipperUrl = "/dictionary/province;/waybill/get/lineCity;/personal/shipper/list;/personal/picker/list;/personal/consignee/list;/personal/cargo/list;/waybill/getPrice;/waybill/save;/waybill/edit;/waybill/goodsQuery;/waybill/tms/signPic;/finance/waybillListNew;/finance/waybillListNew/detail;/waybill/my/list;/waybill/list;/finance/checkIsAccount;/waybill/delete;/qidian/bind/unBindUser;/waybill/messagePush";
    private String driverUrl = "/waybill/getSignDataImg;/waybill/checkHasPre;/qidian/tmsforward/form;/qidian/bind/unBindUser";
    private String carrierUrl = "/qidian/tmsforward/form;/waybill/orderTracking;/waybill/getSignDataImg;/waybill/checkHasPre;/qidian/bind/unBindUser";
    public String employeeUrl =  "/qidian/tmsforward/form;/waybill/getSignDataImg;/waybill/checkHasPre;/waybill/goodsQuery;/waybill/tms/signPic;/waybill/orderTracking;/qidian/tmsforward/json;/qidian/bind/unBindUser";
    private List<PermissionDto> permissionDtoList = setPermissionDtoList();

    public List<PermissionDto> getPermissionDtoList() {
        return permissionDtoList;
    }

    public List<PermissionDto> setPermissionDtoList() {
        List<PermissionDto> permissionDtoList =  new ArrayList<>();
        String [] shipperUrlStr = shipperUrl.split(";");
        String [] driverUrlStr = driverUrl.split(";");
        String [] carrierUrlStr = carrierUrl.split(";");
        String [] employeeUrlStr = employeeUrl.split(";");
        for(String i: shipperUrlStr){
            PermissionDto permissionDto = new PermissionDto();
            permissionDto.getRoleTypeList().add(1);
            permissionDto.setUrlName(i);
            permissionDtoList.add(permissionDto);
        }

        splite(driverUrlStr,permissionDtoList,2);
        splite(carrierUrlStr,permissionDtoList,3);
        splite(employeeUrlStr,permissionDtoList,4);
        for(PermissionDto dto : permissionDtoList){
            System.out.print(dto.getUrlName()+":");
            List<Integer> list = dto.getRoleTypeList();
            for(Integer in : list){
                System.out.print(in);
            }
            System.out.println();
        }

        return permissionDtoList;
    }

    public boolean checkUrl(Integer coumentType , String Url){

        for(PermissionDto dto : permissionDtoList){
            if(Url.startsWith(dto.getUrlName())){
                List<Integer> list = dto.getRoleTypeList();
                if(list.contains(coumentType)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;

    }

    private void splite(String[] str ,List<PermissionDto> list, Integer type){
        for(String i: str){
            boolean has = false;
            int hasIndex = 0;
            for(int j=0 ;j<list.size();j++ ){
                if(i.equals(list.get(j).getUrlName())){
                    has= true;
                    hasIndex = j;
                    break;
                }
            }
            if(has){
                List<Integer> list1 = list.get(hasIndex).getRoleTypeList();
                list1.add(type);
                list.get(hasIndex).setRoleTypeList(list1);
            }else{
                PermissionDto permissionDto = new PermissionDto();
                permissionDto.getRoleTypeList().add(type);
                permissionDto.setUrlName(i);
                list.add(permissionDto);
            }

        }
    }
}
