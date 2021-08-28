package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vdu;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedVdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * container supplemental-boot-data {
 *   leaf boot-data-drive {
 *     type boolean;
 *     default false;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>various/extended-vdu/supplemental-boot-data</i>
 * 
 * <p>To create instances of this class use {@link SupplementalBootDataBuilder}.
 * @see SupplementalBootDataBuilder
 *
 */
public interface SupplementalBootData
    extends
    ChildOf<ExtendedVdu>,
    Augmentable<SupplementalBootData>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("supplemental-boot-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vdu.SupplementalBootData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vdu.SupplementalBootData.class;
    }
    
    /**
     * Some VIMs implement additional drives to host config-files or meta-data
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bootDataDrive</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isBootDataDrive();

}

