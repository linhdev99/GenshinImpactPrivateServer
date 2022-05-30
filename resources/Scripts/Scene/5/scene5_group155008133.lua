local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 155008133
L1_1 = {}
L2_1 = {}
L2_1.config_id = 133001
L2_1.monster_id = 21010101
L3_1 = {}
L3_1.x = -485.084
L3_1.y = 223.213
L3_1.z = 536.071
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 359.421
L3_1.y = 87.832
L3_1.z = 1.868
L2_1.rot = L3_1
L2_1.level = 36
L2_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L2_1.disableWander = true
L2_1.pose_id = 9016
L2_1.area_id = 200
L3_1 = {}
L3_1.config_id = 133004
L3_1.monster_id = 22010101
L4_1 = {}
L4_1.x = -483.859
L4_1.y = 223.573
L4_1.z = 529.468
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 98.993
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 36
L3_1.drop_tag = "\230\183\177\230\184\138\230\179\149\229\184\136"
L3_1.disableWander = true
L3_1.area_id = 200
L4_1 = {}
L4_1.config_id = 133006
L4_1.monster_id = 21030401
L5_1 = {}
L5_1.x = -482.052
L5_1.y = 223.316
L5_1.z = 529.272
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 275.325
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 36
L4_1.drop_tag = "\228\184\152\228\184\152\232\144\168\230\187\161"
L4_1.disableWander = true
L4_1.area_id = 200
L5_1 = {}
L5_1.config_id = 133009
L5_1.monster_id = 21010101
L6_1 = {}
L6_1.x = -478.616
L6_1.y = 223.419
L6_1.z = 523.339
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 142.292
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 36
L5_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L5_1.disableWander = true
L5_1.pose_id = 9016
L5_1.area_id = 200
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 133002
L2_1.gadget_id = 70211012
L3_1 = {}
L3_1.x = -478.767
L3_1.y = 222.787
L3_1.z = 530.632
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 74.084
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 21
L2_1.drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\168\187\229\166\187"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 200
L3_1 = {}
L3_1.config_id = 133005
L3_1.gadget_id = 70220013
L4_1 = {}
L4_1.x = -477.018
L4_1.y = 222.451
L4_1.z = 531.786
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 0.0
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 36
L3_1.area_id = 200
L4_1 = {}
L4_1.config_id = 133007
L4_1.gadget_id = 70220026
L5_1 = {}
L5_1.x = -476.934
L5_1.y = 222.594
L5_1.z = 529.035
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 25.023
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 36
L4_1.area_id = 200
L5_1 = {}
L5_1.config_id = 133008
L5_1.gadget_id = 70310001
L6_1 = {}
L6_1.x = -482.43
L6_1.y = 223.284
L6_1.z = 531.23
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 0.0
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 36
L6_1 = GadgetState
L6_1 = L6_1.GearStart
L5_1.state = L6_1
L5_1.area_id = 200
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1133003
L2_1.name = "ANY_MONSTER_DIE_133003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_133003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_133003"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L4_1 = 133001
L5_1 = 133004
L6_1 = 133006
L7_1 = 133009
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 133002
L5_1 = 133005
L6_1 = 133007
L7_1 = 133008
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_133003"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2
  L2_2 = ScriptLib
  L2_2 = L2_2.GetGroupMonsterCount
  L3_2 = A0_2
  L2_2 = L2_2(L3_2)
  if L2_2 ~= 0 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ANY_MONSTER_DIE_133003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 133002
  L5_2 = GadgetState
  L5_2 = L5_2.Default
  L2_2 = L2_2(L3_2, L4_2, L5_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : set_gadget_state_by_configId"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.MarkPlayerAction
  L3_2 = A0_2
  L4_2 = 4000
  L5_2 = 3
  L6_2 = 1
  L2_2 = L2_2(L3_2, L4_2, L5_2, L6_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : mark_playerAction"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_MONSTER_DIE_133003 = L1_1
