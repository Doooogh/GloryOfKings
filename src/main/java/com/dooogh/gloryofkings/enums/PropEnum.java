package com.dooogh.gloryofkings.enums;

/**
 * @author Li m13283354149@163.com
 * @date 2022/9/2
 * @description 属性
 */
public enum PropEnum {
        PhysicalAttack("物理攻击"),
        MagicAttack("法术攻击"),
        ;

        private String name;

        PropEnum() {
        }

        PropEnum(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

}
