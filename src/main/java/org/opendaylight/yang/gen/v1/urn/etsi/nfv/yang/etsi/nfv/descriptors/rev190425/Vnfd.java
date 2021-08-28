package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.VnfdBuilder.VnfdImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ConfigurableProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.DfKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ElementGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ElementGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Indicator;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IndicatorKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScript;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScriptKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ModifiableAttributes;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VduKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDescKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping vnfd {
 *   leaf id {
 *     type string;
 *   }
 *   leaf provider {
 *     type string;
 *   }
 *   leaf product-name {
 *     type string;
 *   }
 *   leaf software-version {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   leaf product-info-name {
 *     type string;
 *   }
 *   leaf product-info-description {
 *     type string;
 *   }
 *   leaf-list vnfm-info {
 *     type string;
 *     min-elements 1;
 *   }
 *   leaf localization-language {
 *     type string;
 *   }
 *   leaf default-localization-language {
 *     when ../localization-language;
 *     type string;
 *   }
 *   list vdu {
 *     key id;
 *     min-elements 1;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     list int-cpd {
 *       key id;
 *       min-elements 1;
 *       leaf int-virtual-link-desc {
 *         type leafref {
 *           path ../../../int-virtual-link-desc/id;
 *         }
 *       }
 *       leaf bitrate-requirement {
 *         type uint64;
 *         units Mbps;
 *       }
 *       uses virtual-network-interface-requirements;
 *       leaf nicio-requirements {
 *         type leafref {
 *           path ../../../virtual-compute-desc/id;
 *         }
 *       }
 *       leaf-list order {
 *         type uint32;
 *       }
 *       uses cpd;
 *       leaf security-group-rule-id {
 *         type leafref {
 *           path ../../../security-group-rule/id;
 *         }
 *       }
 *     }
 *     leaf virtual-compute-desc {
 *       type leafref {
 *         path ../../virtual-compute-desc/id;
 *       }
 *       must "../../virtual-compute-desc[id=current()]/virtual-memory/size &gt;=../../sw-image-desc[id=current()/../sw-image-desc]/min-ram";
 *     }
 *     leaf-list virtual-storage-desc {
 *       type leafref {
 *         path ../../virtual-storage-desc/id;
 *       }
 *     }
 *     list boot-order {
 *       ordered-by user;
 *       key key;
 *       leaf key {
 *         type uint32;
 *       }
 *       leaf value {
 *         type leafref {
 *           path ../../virtual-storage-desc;
 *         }
 *       }
 *     }
 *     leaf sw-image-desc {
 *       type leafref {
 *         path ../../sw-image-desc/id;
 *       }
 *     }
 *     leaf-list nfvi-constraint {
 *       type string;
 *     }
 *     list monitoring-parameter {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       uses monitoring-parameter;
 *     }
 *     list configurable-properties {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     leaf boot-data {
 *       type string;
 *     }
 *   }
 *   list virtual-compute-desc {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     list logical-node {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       list requirement-detail {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     list request-additional-capability {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf support-mandatory {
 *         type boolean;
 *       }
 *       leaf min-version {
 *         type string;
 *       }
 *       leaf preferred-version {
 *         type string;
 *       }
 *       list target-performance-parameters {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     leaf compute-requirements {
 *       type string;
 *     }
 *     container virtual-memory {
 *       leaf size {
 *         type decimal64 {
 *           fraction-digits 1;
 *           range 0..max;
 *         }
 *         units GB;
 *         default 1;
 *       }
 *       leaf over-subscription-policy {
 *         type string;
 *       }
 *       list vdu-mem-requirements {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *       leaf numa-enabled {
 *         type boolean;
 *       }
 *     }
 *     container virtual-cpu {
 *       leaf cpu-architecture {
 *         type string;
 *       }
 *       leaf num-virtual-cpu {
 *         type uint16 {
 *           range 1..max;
 *         }
 *         default 1;
 *       }
 *       leaf clock {
 *         type uint32;
 *         units MHz;
 *       }
 *       leaf oversubscription-policy {
 *         type string;
 *       }
 *       list vdu-cpu-requirements {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *       container pinning {
 *         presence "Set to specify CPU pinning.";
 *         leaf policy {
 *           default dynamic;
 *           type enumeration {
 *             enum static;
 *             enum dynamic;
 *           }
 *         }
 *         list rule {
 *           when "../policy = 'static'";
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list virtual-storage-desc {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf type-of-storage {
 *       default root-storage;
 *       type identityref {
 *         base storage-type;
 *       }
 *     }
 *     leaf size-of-storage {
 *       type uint64;
 *       units GB;
 *       default 0;
 *     }
 *     list vdu-storage-requirements {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     leaf rdma-enabled {
 *       type boolean;
 *     }
 *     leaf sw-image-desc {
 *       type leafref {
 *         path ../../sw-image-desc/id;
 *       }
 *       must "../size-of-storage &gt;=../../sw-image-desc[id=current()]/min-disk";
 *     }
 *   }
 *   list sw-image-desc {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *     container checksum {
 *       leaf algorithm {
 *         type identityref {
 *           base checksum-algorithm;
 *         }
 *       }
 *       leaf hash {
 *         type string;
 *       }
 *     }
 *     leaf container-format {
 *       default bare;
 *       type enumeration {
 *         enum aki {
 *         }
 *         enum ami {
 *         }
 *         enum ari {
 *         }
 *         enum bare {
 *         }
 *         enum docker {
 *         }
 *         enum ova {
 *         }
 *         enum ovf {
 *         }
 *       }
 *     }
 *     leaf disk-format {
 *       default qcow2;
 *       type enumeration {
 *         enum aki {
 *         }
 *         enum ami {
 *         }
 *         enum ari {
 *         }
 *         enum iso {
 *         }
 *         enum qcow2 {
 *         }
 *         enum raw {
 *         }
 *         enum vdi {
 *         }
 *         enum vhd {
 *         }
 *         enum vhdx {
 *         }
 *         enum vmdk {
 *         }
 *       }
 *     }
 *     leaf min-disk {
 *       type uint64;
 *       units GB;
 *     }
 *     leaf min-ram {
 *       type decimal64 {
 *         fraction-digits 1;
 *         range 0..max;
 *       }
 *       units GB;
 *       default 0;
 *     }
 *     leaf size {
 *       type uint64;
 *       units GB;
 *     }
 *     leaf image {
 *       default .;
 *       type inet:uri;
 *     }
 *     leaf operating-system {
 *       type string;
 *     }
 *     leaf-list supported-virtualization-environment {
 *       type string;
 *     }
 *   }
 *   list int-virtual-link-desc {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     list flavour {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       container qos {
 *         presence "VL QoS parameters";
 *         leaf latency {
 *           type uint32;
 *           units ms;
 *         }
 *         leaf packet-delay-variation {
 *           type uint32;
 *           units ms;
 *         }
 *         leaf packet-loss-ratio {
 *           type decimal64 {
 *             fraction-digits 2;
 *             range 0..1.00;
 *           }
 *         }
 *       }
 *     }
 *     uses connectivity-type;
 *     leaf-list test-access {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     list monitoring-parameters {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       uses monitoring-parameter;
 *     }
 *   }
 *   uses security-group-rule;
 *   list ext-cpd {
 *     key id;
 *     min-elements 1;
 *     choice cp-connection {
 *       case int-virtual-link-desc {
 *         leaf int-virtual-link-desc {
 *           type leafref {
 *             path ../../int-virtual-link-desc/id;
 *           }
 *         }
 *       }
 *       case int-cpd {
 *         container int-cpd {
 *           leaf vdu-id {
 *             type leafref {
 *               path ../../../vdu/id;
 *             }
 *           }
 *           leaf cpd {
 *             type string;
 *           }
 *         }
 *       }
 *       case k8s-cluster-net {
 *         leaf k8s-cluster-net {
 *           type string;
 *         }
 *       }
 *     }
 *     uses virtual-network-interface-requirements;
 *     leaf nicio-requirements {
 *       type leafref {
 *         path ../../virtual-compute-desc/id;
 *       }
 *     }
 *     uses cpd;
 *     leaf security-group-rule-id {
 *       type leafref {
 *         path ../../security-group-rule/id;
 *       }
 *     }
 *   }
 *   list df {
 *     must "default-instantiation-level or count(instantiation-level) = 1";
 *     key id;
 *     min-elements 1;
 *     leaf id {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     list vdu-profile {
 *       key id;
 *       min-elements 1;
 *       leaf id {
 *         type leafref {
 *           path ../../../vdu/id;
 *         }
 *       }
 *       leaf min-number-of-instances {
 *         type uint16;
 *         default 1;
 *       }
 *       leaf max-number-of-instances {
 *         type uint16;
 *         default 1;
 *         must ". &gt;= ../min-number-of-instances";
 *       }
 *       uses local-affinity-or-anti-affinity-rule;
 *       list affinity-or-anti-affinity-group {
 *         key id;
 *         leaf id {
 *           type leafref {
 *             path ../../../affinity-or-anti-affinity-group/id;
 *           }
 *         }
 *       }
 *     }
 *     list virtual-link-profile {
 *       key "id flavour";
 *       leaf id {
 *         type leafref {
 *           path ../../../int-virtual-link-desc/id;
 *         }
 *       }
 *       leaf flavour {
 *         type leafref {
 *           path ../../../flavour/id;
 *         }
 *       }
 *       uses local-affinity-or-anti-affinity-rule;
 *       list affinity-or-anti-affinity-group {
 *         key id;
 *         leaf id {
 *           type leafref {
 *             path ../../../affinity-or-anti-affinity-group/id;
 *           }
 *         }
 *       }
 *       container max-bit-rate-requirements {
 *         leaf root {
 *           type uint32;
 *         }
 *         leaf leaf {
 *           type uint32;
 *         }
 *       }
 *       container min-bit-rate-requirements {
 *         leaf root {
 *           type uint32;
 *         }
 *         leaf leaf {
 *           type uint32;
 *         }
 *       }
 *       container virtual-link-protocol-data {
 *         leaf associated-layer-protocol {
 *           type identityref {
 *             base layer-protocol;
 *           }
 *         }
 *         container l2-protocol-data {
 *           when "(../associated-layer-protocol = 'Ethernet') or (../associated-layer-protocol = 'MPLS') or (../associated-layer-protocol = 'ODU2') or (../associated-layer-protocol = 'Pseudo-Wire')";
 *           leaf name {
 *             type string;
 *           }
 *           leaf network-type {
 *             type enumeration {
 *               enum flat;
 *               enum vlan;
 *               enum vxlan;
 *               enum gre;
 *             }
 *           }
 *           leaf vlan-transparent {
 *             type boolean;
 *           }
 *           leaf mtu {
 *             type uint16;
 *           }
 *         }
 *         container l3-protocol-data {
 *           when "(../associated-layer-protocol = 'IPv4') or (../associated-layer-protocol = 'IPv6')";
 *           leaf name {
 *             type string;
 *           }
 *           leaf ip-version {
 *             type enumeration {
 *               enum ipv4;
 *               enum ipv6;
 *             }
 *             default ipv4;
 *           }
 *           leaf cidr {
 *             type string;
 *           }
 *           leaf-list ip-allocation-pools {
 *             type string;
 *           }
 *           leaf gateway-ip {
 *             type inet:ip-address;
 *           }
 *           leaf dhcp-enabled {
 *             type boolean;
 *             default true;
 *           }
 *           leaf ipv6-address-mode {
 *             when "../ip-version = 'ipv6'";
 *             type enumeration {
 *               enum slaac;
 *               enum dhcpv6-stateful;
 *               enum dhcpv6-stateless;
 *             }
 *           }
 *         }
 *       }
 *     }
 *     list instantiation-level {
 *       key id;
 *       min-elements 1;
 *       leaf id {
 *         type string;
 *       }
 *       leaf description {
 *         type string;
 *       }
 *       list vdu-level {
 *         key vdu-id;
 *         min-elements 1;
 *         leaf vdu-id {
 *           type leafref {
 *             path ../../../../vdu/id;
 *           }
 *         }
 *         leaf number-of-instances {
 *           type uint16;
 *           must ". &lt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/max-number-of-instances";
 *           must ". &gt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/min-number-of-instances";
 *           default 1;
 *         }
 *       }
 *       list scaling-info {
 *         key scaling-aspect-id;
 *         leaf scaling-aspect-id {
 *           type leafref {
 *             path ../../../scaling-aspect/id;
 *           }
 *         }
 *         leaf scale-level {
 *           type uint32;
 *         }
 *       }
 *     }
 *     leaf default-instantiation-level {
 *       type leafref {
 *         path ../instantiation-level/id;
 *       }
 *     }
 *     leaf-list supported-operation {
 *       type identityref {
 *         base supported-operation;
 *       }
 *     }
 *     container lcm-operations-configuration {
 *       container instantiate-vnf-op-config {
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *       container scale-vnf-op-config {
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *         leaf scaling-by-more-than-one-step-supported {
 *           type boolean;
 *           default false;
 *         }
 *       }
 *       container scale-vnf-to-level-op-config {
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *         leaf arbitrary-target-levels-supported {
 *           type boolean;
 *           default false;
 *         }
 *       }
 *       container heal-vnf-op-config {
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *         leaf-list cause {
 *           type string;
 *         }
 *       }
 *       container terminate-vnf-op-config {
 *         leaf min-graceful-termination {
 *           type yang:timeticks;
 *           default 1;
 *         }
 *         leaf max-recommended-graceful-termination {
 *           type yang:timeticks;
 *         }
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *       container operate-vnf-op-config {
 *         leaf min-graceful-stop-timeout {
 *           type yang:timeticks;
 *           default 1;
 *         }
 *         leaf max-recommended-graceful-stop-timeout {
 *           type yang:timeticks;
 *         }
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *       container change-vnf-flavour-op-config {
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *       container change-ext-vnf-connectivity-op-config {
 *         list parameter {
 *           key key;
 *           leaf key {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *     }
 *     list affinity-or-anti-affinity-group {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf type {
 *         type affinity-type;
 *       }
 *       leaf scope {
 *         type affinity-scope;
 *       }
 *     }
 *     list indicator {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf indicator-value {
 *         type string;
 *       }
 *       leaf source {
 *         type enumeration {
 *           enum vnf;
 *           enum em;
 *           enum both;
 *         }
 *       }
 *     }
 *     list supported-vnf-interfaces {
 *       key name;
 *       leaf name {
 *         type enumeration {
 *           enum vnf-configuration;
 *           enum vnf-indicator;
 *         }
 *       }
 *       leaf-list cpd-id {
 *         type leafref {
 *           path ../../../ext-cpd/id;
 *         }
 *       }
 *       list interface-details {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     list monitoring-parameter {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       uses monitoring-parameter;
 *     }
 *     list scaling-aspect {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf description {
 *         type string;
 *       }
 *       leaf max-scale-level {
 *         type uint32 {
 *           range 1..max;
 *         }
 *       }
 *       container aspect-delta-details {
 *         list deltas {
 *           key id;
 *           min-elements 1;
 *           leaf id {
 *             type string;
 *           }
 *           list vdu-delta {
 *             key id;
 *             leaf id {
 *               type leafref {
 *                 path ../../../../../../vdu/id;
 *               }
 *             }
 *             leaf number-of-instances {
 *               type uint32 {
 *                 range 0..max;
 *               }
 *             }
 *           }
 *           list virtual-link-bit-rate-delta {
 *             key id;
 *             leaf id {
 *               type string;
 *             }
 *             container bit-rate-requirements {
 *               leaf root {
 *                 type uint32;
 *                 units bits/sec;
 *               }
 *               leaf leaf {
 *                 type uint32;
 *                 units bits/sec;
 *               }
 *             }
 *           }
 *         }
 *         leaf step-deltas {
 *           type leafref {
 *             path ../deltas/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   container configurable-properties {
 *     leaf is-auto-scalable-enabled {
 *       type boolean;
 *     }
 *     leaf is-auto-heal-enabled {
 *       type boolean;
 *     }
 *     list additional-configurable-property {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   container modifiable-attributes {
 *     leaf-list extension {
 *       type string;
 *     }
 *     leaf-list metadata {
 *       type string;
 *     }
 *   }
 *   list lifecycle-management-script {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf-list event {
 *       type internal-lifecycle-management-script-event;
 *     }
 *     leaf-list lcm-transition-event {
 *       type string;
 *     }
 *     leaf script {
 *       type string;
 *     }
 *     leaf script-dsl {
 *       type string;
 *     }
 *     list script-input {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   list element-group {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf-list vdu {
 *       type leafref {
 *         path ../../vdu/id;
 *       }
 *     }
 *     leaf-list virtual-link-desc {
 *       type leafref {
 *         path ../../int-virtual-link-desc/id;
 *       }
 *     }
 *   }
 *   list indicator {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf-list indicator-value {
 *       type string;
 *     }
 *     leaf source {
 *       type enumeration {
 *         enum vnf;
 *         enum em;
 *         enum both;
 *       }
 *     }
 *   }
 *   leaf-list auto-scale {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd</i>
 *
 */
@JsonDeserialize(as = VnfdImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Vnfd
    extends
    DataObject,
    SecurityGroupRule
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd");

    @Override
    Class<? extends Vnfd> implementedInterface();
    
    /**
     * Identifier of this VNFD information element. This attribute shall be globally
     * unique. The format will be defined in the data model specification phase.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Provider of the VNF and of the VNFD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>provider</code>, or <code>null</code> if not present
     */
    @Nullable String getProvider();
    
    /**
     * Name to identify the VNF Product. Invariant for the VNF Product lifetime.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>productName</code>, or <code>null</code> if not present
     */
    @Nullable String getProductName();
    
    /**
     * Software version of the VNF. This is changed when there is any change to the
     * software that is included in the VNF Package
     *
     *
     *
     * @return <code>java.lang.String</code> <code>softwareVersion</code>, or <code>null</code> if not present
     */
    @Nullable String getSoftwareVersion();
    
    /**
     * Identifies the version of the VNFD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable String getVersion();
    
    /**
     * Human readable name of the VNFD. Can change during the VNF Product lifetime.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>productInfoName</code>, or <code>null</code> if not present
     */
    @Nullable String getProductInfoName();
    
    /**
     * Human readable description of the VNFD. Can change during the VNF Product
     * lifetime.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>productInfoDescription</code>, or <code>null</code> if not present
     */
    @Nullable String getProductInfoDescription();
    
    /**
     * Identifies VNFM(s) compatible with the VNF described in this version of the
     * VNFD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfmInfo</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVnfmInfo();
    
    /**
     * Information about the language of the VNF.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>localizationLanguage</code>, or <code>null</code> if not present
     */
    @Nullable String getLocalizationLanguage();
    
    /**
     * Default localization language that is instantiated if no information about
     * selected localization language is available. Shall be present if
     * 'localization-language' is present and shall be absent otherwise.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultLocalizationLanguage</code>, or <code>null</code> if not present
     */
    @Nullable String getDefaultLocalizationLanguage();
    
    /**
     * The Virtualisation Deployment Unit (VDU) is a construct supporting the
     * description of the deployment and operational behaviour of a VNF component, or
     * the entire VNF if it was not componentized in components.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vdu</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduKey, Vdu> getVdu();
    
    /**
     * @return <code>java.util.Map</code> <code>vdu</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduKey, Vdu> nonnullVdu() {
        return CodeHelpers.nonnull(getVdu());
    }
    
    /**
     * Defines descriptors of virtual compute resources to be used by the VNF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualComputeDesc</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualComputeDescKey, VirtualComputeDesc> getVirtualComputeDesc();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualComputeDesc</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualComputeDescKey, VirtualComputeDesc> nonnullVirtualComputeDesc() {
        return CodeHelpers.nonnull(getVirtualComputeDesc());
    }
    
    /**
     * Storage requirements for a Virtual Storage instance attached to the VNFC created
     * from this VDU
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualStorageDesc</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualStorageDescKey, VirtualStorageDesc> getVirtualStorageDesc();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualStorageDesc</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualStorageDescKey, VirtualStorageDesc> nonnullVirtualStorageDesc() {
        return CodeHelpers.nonnull(getVirtualStorageDesc());
    }
    
    /**
     * Defines descriptors of software images to be used by the VNF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>swImageDesc</code>, or <code>null</code> if not present
     */
    @Nullable Map<SwImageDescKey, SwImageDesc> getSwImageDesc();
    
    /**
     * @return <code>java.util.Map</code> <code>swImageDesc</code>, or an empty list if it is not present
     */
    default @NonNull Map<SwImageDescKey, SwImageDesc> nonnullSwImageDesc() {
        return CodeHelpers.nonnull(getSwImageDesc());
    }
    
    /**
     * Represents the type of network connectivity mandated by the VNF provider between
     * two or more CPs which includes at least one internal CP.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>intVirtualLinkDesc</code>, or <code>null</code> if not present
     */
    @Nullable Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> getIntVirtualLinkDesc();
    
    /**
     * @return <code>java.util.Map</code> <code>intVirtualLinkDesc</code>, or an empty list if it is not present
     */
    default @NonNull Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> nonnullIntVirtualLinkDesc() {
        return CodeHelpers.nonnull(getIntVirtualLinkDesc());
    }
    
    /**
     * Describes an external interface exposed by this VNF enabling connection with a
     * Virual Link
     *
     *
     *
     * @return <code>java.util.Map</code> <code>extCpd</code>, or <code>null</code> if not present
     */
    @Nullable Map<ExtCpdKey, ExtCpd> getExtCpd();
    
    /**
     * @return <code>java.util.Map</code> <code>extCpd</code>, or an empty list if it is not present
     */
    default @NonNull Map<ExtCpdKey, ExtCpd> nonnullExtCpd() {
        return CodeHelpers.nonnull(getExtCpd());
    }
    
    /**
     * Describes a specific Deployment Flavour (DF) of a VNF with specific requirements
     * for capacity and performance.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>df</code>, or <code>null</code> if not present
     */
    @Nullable Map<DfKey, Df> getDf();
    
    /**
     * @return <code>java.util.Map</code> <code>df</code>, or an empty list if it is not present
     */
    default @NonNull Map<DfKey, Df> nonnullDf() {
        return CodeHelpers.nonnull(getDf());
    }
    
    /**
     * Describes the configurable properties of the VNF (e.g. related to auto scaling
     * and auto healing).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ConfigurableProperties</code> <code>configurableProperties</code>, or <code>null</code> if not present
     */
    @Nullable ConfigurableProperties getConfigurableProperties();
    
    /**
     * Describes the modifiable attributes of the VNF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ModifiableAttributes</code> <code>modifiableAttributes</code>, or <code>null</code> if not present
     */
    @Nullable ModifiableAttributes getModifiableAttributes();
    
    /**
     * Includes a list of events and corresponding management scripts performed for the
     * VNF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>lifecycleManagementScript</code>, or <code>null</code> if not present
     */
    @Nullable Map<LifecycleManagementScriptKey, LifecycleManagementScript> getLifecycleManagementScript();
    
    /**
     * @return <code>java.util.Map</code> <code>lifecycleManagementScript</code>, or an empty list if it is not present
     */
    default @NonNull Map<LifecycleManagementScriptKey, LifecycleManagementScript> nonnullLifecycleManagementScript() {
        return CodeHelpers.nonnull(getLifecycleManagementScript());
    }
    
    /**
     * Describes the associated elements of a VNFD for a certain purpose during VNF
     * lifecycle management.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>elementGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<ElementGroupKey, ElementGroup> getElementGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>elementGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<ElementGroupKey, ElementGroup> nonnullElementGroup() {
        return CodeHelpers.nonnull(getElementGroup());
    }
    
    /**
     * Declares the VNF indicators that are supported by this VNF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>indicator</code>, or <code>null</code> if not present
     */
    @Nullable Map<IndicatorKey, Indicator> getIndicator();
    
    /**
     * @return <code>java.util.Map</code> <code>indicator</code>, or an empty list if it is not present
     */
    default @NonNull Map<IndicatorKey, Indicator> nonnullIndicator() {
        return CodeHelpers.nonnull(getIndicator());
    }
    
    /**
     * Rule that determines when a scaling action needs to be triggered on a VNF
     * instance e.g. based on certain VNF indicator values or VNF indicator value
     * changes or a combination of VNF indicator value(s) and monitoring parameter(s).
     *
     *
     *
     * @return <code>java.util.List</code> <code>autoScale</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getAutoScale();

}

